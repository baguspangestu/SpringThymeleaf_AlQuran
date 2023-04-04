const search = document.getElementById("search");

search.addEventListener("input", (event) => {
  const value = removeSpecialChars(event.target.value);
  const items = document.querySelectorAll(".item-card");

  if (items.length > 0) {
    items.forEach((item) => {
      const name = removeSpecialChars(
        item.querySelector(".item-card__name").innerText
      );
      if (name.indexOf(value) > -1) {
        item.style.display = "block";
      } else {
        item.style.display = "none";
      }
    });
  }
});

const removeSpecialChars = (value) =>
  value
    .replace(/[^\w\s]|_/gi, "")
    .replace(/\s+/g, "")
    .toLowerCase();
