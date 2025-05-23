window.addEventListener("DOMContentLoaded", () => {
  const iconoLogin = document.getElementById("login-icon");

  const nuevaRuta = "../img/imagen1comida.png";

  if (iconoLogin) {
    iconoLogin.src = nuevaRuta;
  }
});

window.addEventListener("DOMContentLoaded", () => {
  const iconoLogin = document.getElementById("login-icon");

  const estaLogueado = localStorage.getItem("usuarioLogueado") === "true";
  const avatar = localStorage.getItem("avatar");

  if (estaLogueado && avatar && iconoLogin) {
    iconoLogin.src = avatar;
  }
});

window.addEventListener("DOMContentLoaded", () => {
  const iconoLogin = document.getElementById("login-icon");
  const btnLogout = document.getElementById("btn-logout");

  const estaLogueado = localStorage.getItem("usuarioLogueado") === "true";
  const avatar = localStorage.getItem("avatar");

  if (estaLogueado && avatar && iconoLogin) {
    iconoLogin.src = avatar;
    if (btnLogout) btnLogout.style.display = "inline-block"; // Mostrar botón cerrar sesión
  }

  // Cerrar sesión al hacer clic
  if (btnLogout) {
    btnLogout.addEventListener("click", () => {
      localStorage.removeItem("usuarioLogueado");
      localStorage.removeItem("avatar");
      location.reload(); // Recargar para que los cambios se apliquen
    });
  }
});

if (estaLogueado && avatar && iconoLogin) {
  iconoLogin.src = avatar;
  if (btnLogout) btnLogout.classList.remove("oculto"); // Mostrar botón
}
