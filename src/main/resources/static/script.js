const provinsi = document.getElementById("provinsi");
const kabKota = document.getElementById("kabKota");

let provinsiValue = provinsi.value;

provinsi.addEventListener("change", onSelectProvinsi);
function onSelectProvinsi(event) {
  provinsiValue = event.target.value;
  getDataKabKota(provinsiValue);
}

kabKota.addEventListener("change", onSelectKabKota);
function onSelectKabKota(event) {
  window.location.href = `/?provinsi=${provinsiValue}&kabkota=${event.target.value}`;
}

async function getDataKabKota(provinsi) {
  try {
    const response = await fetch("https://equran.id/api/v2/imsakiyah/kabkota", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ provinsi }),
    });
    const res = await response.json();
    kabKota.options.length = 0;
    const labelOption = new Option("Pilih Kabupaten/Kota");
    labelOption.disabled = true;
    labelOption.selected = true;
    kabKota.add(labelOption);
    res.data.forEach((value) => {
      const newOption = new Option(value, value);
      kabKota.add(newOption);
    });
  } catch (error) {
    console.error(error);
  }
}
