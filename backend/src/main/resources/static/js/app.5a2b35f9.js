(function(){"use strict";var e={6980:function(e,n,r){var t=r(144),o=r(998),a=r(2928),i=function(){var e=this,n=e._self._c;return n(o.Z,[n(a.Z,[n("router-link",{attrs:{to:"/home"}},[e._v("Home")]),n("router-view")],1)],1)},s=[],u={name:"App",data:()=>({})},c=u,l=r(1001),f=(0,l.Z)(c,i,s,!1,null,null,null),p=f.exports,v=r(8345),m=r(8178),d=function(){var e=this,n=e._self._c;return n(m.Z,{staticClass:"elevation-1",attrs:{headers:e.headers,items:e.desserts,"items-per-page":5}})},b=[],h={name:"home",components:{},data(){return{headers:[{text:"Dessert (100g serving)",align:"start",sortable:!1,value:"name"},{text:"Calories",value:"calories"},{text:"Fat (g)",value:"fat"},{text:"Carbs (g)",value:"carbs"},{text:"Protein (g)",value:"protein"},{text:"Iron (%)",value:"iron"}],desserts:[{name:"Frozen Yogurt",calories:159,fat:6,carbs:24,protein:4,iron:"1%"},{name:"Ice cream sandwich",calories:237,fat:9,carbs:37,protein:4.3,iron:"1%"},{name:"Eclair",calories:262,fat:16,carbs:23,protein:6,iron:"7%"},{name:"Cupcake",calories:305,fat:3.7,carbs:67,protein:4.3,iron:"8%"},{name:"Gingerbread",calories:356,fat:16,carbs:49,protein:3.9,iron:"16%"},{name:"Jelly bean",calories:375,fat:0,carbs:94,protein:0,iron:"0%"},{name:"Lollipop",calories:392,fat:.2,carbs:98,protein:0,iron:"2%"},{name:"Honeycomb",calories:408,fat:3.2,carbs:87,protein:6.5,iron:"45%"},{name:"Donut",calories:452,fat:25,carbs:51,protein:4.9,iron:"22%"},{name:"KitKat",calories:518,fat:26,carbs:65,protein:7,iron:"6%"}]}},async created(){const e=await fetch("http://localhost:8080/movies",{method:"GET"});return await e.json()},methods:{}},g=h,y=(0,l.Z)(g,d,b,!1,null,null,null),w=y.exports;t.ZP.use(v.ZP);const O=[{path:"/home",name:"home",component:w}],Z=new v.ZP({mode:"history",base:"/",routes:O});var x=Z,P=r(1705);t.ZP.use(P.Z);var j=new P.Z({});t.ZP.config.productionTip=!1,new t.ZP({router:x,vuetify:j,render:e=>e(p)}).$mount("#app")}},n={};function r(t){var o=n[t];if(void 0!==o)return o.exports;var a=n[t]={exports:{}};return e[t](a,a.exports,r),a.exports}r.m=e,function(){var e=[];r.O=function(n,t,o,a){if(!t){var i=1/0;for(l=0;l<e.length;l++){t=e[l][0],o=e[l][1],a=e[l][2];for(var s=!0,u=0;u<t.length;u++)(!1&a||i>=a)&&Object.keys(r.O).every((function(e){return r.O[e](t[u])}))?t.splice(u--,1):(s=!1,a<i&&(i=a));if(s){e.splice(l--,1);var c=o();void 0!==c&&(n=c)}}return n}a=a||0;for(var l=e.length;l>0&&e[l-1][2]>a;l--)e[l]=e[l-1];e[l]=[t,o,a]}}(),function(){r.n=function(e){var n=e&&e.__esModule?function(){return e["default"]}:function(){return e};return r.d(n,{a:n}),n}}(),function(){r.d=function(e,n){for(var t in n)r.o(n,t)&&!r.o(e,t)&&Object.defineProperty(e,t,{enumerable:!0,get:n[t]})}}(),function(){r.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(e){if("object"===typeof window)return window}}()}(),function(){r.o=function(e,n){return Object.prototype.hasOwnProperty.call(e,n)}}(),function(){r.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})}}(),function(){var e={143:0};r.O.j=function(n){return 0===e[n]};var n=function(n,t){var o,a,i=t[0],s=t[1],u=t[2],c=0;if(i.some((function(n){return 0!==e[n]}))){for(o in s)r.o(s,o)&&(r.m[o]=s[o]);if(u)var l=u(r)}for(n&&n(t);c<i.length;c++)a=i[c],r.o(e,a)&&e[a]&&e[a][0](),e[a]=0;return r.O(l)},t=self["webpackChunkfrontend"]=self["webpackChunkfrontend"]||[];t.forEach(n.bind(null,0)),t.push=n.bind(null,t.push.bind(t))}();var t=r.O(void 0,[998],(function(){return r(6980)}));t=r.O(t)})();
//# sourceMappingURL=app.5a2b35f9.js.map