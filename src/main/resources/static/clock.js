function updateClock() {
  const clock = document.getElementById("clock");
  const date = new Date();
  const wibDate = new Date(date.getTime() + 7 * 60 * 60 * 1000);
  let hours = wibDate.getUTCHours();
  let minutes = wibDate.getUTCMinutes();
  let seconds = wibDate.getUTCSeconds();
  hours = hours < 10 ? "0" + hours : hours;
  minutes = minutes < 10 ? "0" + minutes : minutes;
  seconds = seconds < 10 ? "0" + seconds : seconds;
  clock.textContent = `${hours}:${minutes}:${seconds} WIB`;
}

function initClock() {
  updateClock();
  window.setInterval("updateClock()", 1000);
}
