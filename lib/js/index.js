/* (c) IGOR KOWALCZYK. All rights reserved. */

const toggletheme = document.querySelector('.theme-switch input[type="checkbox"]');
const currenttheme = localStorage.getItem('theme');
if (currenttheme) {
document.documentElement.setAttribute('data-theme', currenttheme);
if (currenttheme === 'dark') {
toggletheme.checked = true;
}
}
function switchtheme(e) {
if (e.target.checked) {
document.documentElement.setAttribute('data-theme', 'dark');
localStorage.setItem('theme', 'dark');
}
else {
document.documentElement.setAttribute('data-theme', 'light');
localStorage.setItem('theme', 'light');
}
}
toggletheme.addEventListener('change', switchtheme, false);

var link1 = document.querySelector('.card-1');
link1.addEventListener('click', function() {
window.open("https://hhongjiang.github.io/anomaly_detection");
});

var link2 = document.querySelector('.card-2');
link2.addEventListener('click', function() {
window.open("https://hhongjiang.github.io/object-detection");
});

var link3 = document.querySelector('.card-3');
link3.addEventListener('click', function() {
window.open("https://hhongjiang.github.io/java-project");
});

var link4 = document.querySelector('.card-4');
link4.addEventListener('click', function() {
window.open("https://hhongjiang.github.io/trajectory-clustering");
});

var link5 = document.querySelector('.card-5');
link5.addEventListener('click', function() {
window.open("https://hhongjiang.github.io/ospf-network");
});

var scrollposition = window.scrollY;
var logocontainer = document.getElementsByClassName('nav')[0];
window.addEventListener('scroll', function() {
scrollposition = window.scrollY;
if (scrollposition >= 40) {
logocontainer.classList.add('nav-scrolled');
} else {
logocontainer.classList.remove('nav-scrolled');
}
});

document.addEventListener('click', function(event) {
if (event.target.tagName !== "A" || !event.target.href || event.target.target == "_blank") return;
event.preventDefault();
var link = event.target;
document.body.style.opacity = 0;
document.body.addEventListener("transitionend", function() {
location.href = link.href;
});
});

var date = document.querySelector(".date");
date.innerHTML = (new Date().getFullYear());