const pilihAyat = document.querySelector("#pilih-ayat");

pilihAyat.addEventListener("change", (event) => {
  const ayats = document.querySelectorAll(".ayat");
  const ayat = event.target.value;
  ayats[ayat - 1].scrollIntoView({ block: "center" });
});
