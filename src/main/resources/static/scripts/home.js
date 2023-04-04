const search = document.getElementById("search");

search.addEventListener("input", (event) => {
  const value = event.target.value;
  const items = document.querySelectorAll(".item-card");
  if (items.length > 0) {
    items.forEach((item) => {
      const name = item.querySelector(".item-card__name").innerText;
      if (name.toLowerCase().indexOf(value.toLowerCase()) > -1) {
        item.style.display = "block";
      } else {
        item.style.display = "none";
      }
    });
  }
});
