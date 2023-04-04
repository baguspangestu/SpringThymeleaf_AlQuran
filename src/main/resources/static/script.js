const button = document.getElementById("back-to-top");

let timeoutId;

function showBackToTopBtn() {
  button.style.display = "block";
  clearTimeout(timeoutId);
  timeoutId = setTimeout(hideBackToTopBtn, 3000);
}

function hideBackToTopBtn() {
  button.style.display = "none";
}

window.addEventListener("scroll", function () {
  if (
    document.body.scrollTop > 100 ||
    document.documentElement.scrollTop > 100
  ) {
    showBackToTopBtn();
  } else {
    hideBackToTopBtn();
  }
});

button.addEventListener("click", function () {
  window.scrollTo({
    top: 0,
    behavior: "smooth",
  });
});
