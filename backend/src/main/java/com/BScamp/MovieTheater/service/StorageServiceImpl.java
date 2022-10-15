package com.BScamp.MovieTheater.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageServiceImpl implements StorageService {

	private final Path storagePath;

	private final Random random = new Random();

	@Value("${custom.delete.files}")
	private boolean customDeleteFiles;

	@Autowired
	public StorageServiceImpl() throws IOException {

		Path storagePath = Paths.get("").resolve("src").resolve("main")
				.resolve("resources").resolve("static").resolve("images");
		if (!Files.exists(storagePath)) {
			Files.createDirectories(storagePath);
		}
		this.storagePath = storagePath;

	}

	@Override
	public String save(MultipartFile file, String fileType) {

		String filePath = null;

		try {
			String fileName = random.nextInt(999999) + "_"
					+ StringUtils.cleanPath(file.getOriginalFilename());
			Files.copy(
					file.getInputStream(), this.storagePath.resolve(fileName),
					StandardCopyOption.REPLACE_EXISTING
			);
			switch (fileType) {
				case "video/mp4" :
					filePath = "/media/mp4/" + fileName;
					break;
				case "image/jpg" :
				case "image/jpeg" :
					filePath = "/media/jpg/" + fileName;
					break;
				case "image/png" :
				default :
					filePath = "/media/png/" + fileName;
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return filePath;

	}

	@Override
	public byte[] load(String fileName) {

		byte[] retBytes = null;

		try {
			Path file = this.storagePath.resolve(fileName);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable()) {
				retBytes = StreamUtils
						.copyToByteArray(resource.getInputStream());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return retBytes;

	}

	@Override
	public boolean delete(String filePath) {

		try {
			Files.delete(this.storagePath.resolve(filePath));
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public String update(MultipartFile file, String fileType, String filePath) {

		String retfilePath = null;

		filePath = filePath.replace("/media/jpg/", "");
		filePath = filePath.replace("/media/png/", "");
		filePath = filePath.replace("/media/mp4/", "");
		try {
			if (filePath != null && filePath != "") {
				try {
					Files.delete(this.storagePath.resolve(filePath));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			String fileName = random.nextInt(999999) + "_"
					+ StringUtils.cleanPath(file.getOriginalFilename());
			Files.copy(
					file.getInputStream(), this.storagePath.resolve(fileName),
					StandardCopyOption.REPLACE_EXISTING
			);
			switch (fileType) {
				case "video/mp4" :
					retfilePath = "/media/mp4/" + fileName;
					break;
				case "image/jpg" :
				case "image/jpeg" :
					retfilePath = "/media/jpg/" + fileName;
					break;
				case "image/png" :
				default :
					retfilePath = "/media/png/" + fileName;
					break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return retfilePath;

	}

	@Override
	public void clearAll() {

		try {
			if (customDeleteFiles) {
				Files.walk(storagePath).sorted().forEach(t -> {
					try {
						if (!Files.isDirectory(t)) {
							Files.deleteIfExists(t);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				});
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}