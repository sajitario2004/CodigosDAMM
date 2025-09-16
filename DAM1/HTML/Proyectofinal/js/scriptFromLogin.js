const form = document.getElementById("loginForm");
const email = document.getElementById("email");
const password = document.getElementById("password");

const errorEmail = document.getElementById("errorEmail");
const errorPassword = document.getElementById("errorPassword");
const mensaje = document.getElementById("mensaje");

email.addEventListener("input", () => {
  if (!validarEmail(email.value.trim())) {
    errorEmail.textContent = "Correo inválido. Debe contener @ y un punto.";
  } else {
    errorEmail.textContent = "";
  }
});

password.addEventListener("input", () => {
  if (password.value.length < 6) {
    errorPassword.textContent = "Mínimo 6 caracteres.";
  } else {
    errorPassword.textContent = "";
  }
});

form.addEventListener("submit", (e) => {
  e.preventDefault();
  let valido = true;

  if (!validarEmail(email.value.trim())) {
    errorEmail.textContent = "Correo inválido. Debe contener @ y un punto.";
    valido = false;
  }

  if (password.value.length < 6) {
    errorPassword.textContent = "Mínimo 6 caracteres.";
    valido = false;
  }

  if (valido) {
    mensaje.textContent = "¡Inicio de sesión exitoso!";
    mensaje.style.color = "green";
    form.reset();


    limpiarErrores();


  } else {
    Swal.fire({
      icon: "error",
      title: "Oops...",
      text: "Por favor, corrige los errores.",
      footer: '<a href="#">¿Por qué tengo este problema?</a>'
    });
  }
});

function validarEmail(email) {
  const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return regex.test(email);
}

function limpiarErrores() {
  errorEmail.textContent = "";
  errorPassword.textContent = "";
}



document.getElementById("form-login").addEventListener("submit", function (e) {
  e.preventDefault();

  const correo = document.getElementById("correo").value;
  const clave = document.getElementById("clave").value;

  // Validación básica
  if (correo.includes("@") && clave.length >= 4) {
    localStorage.setItem("usuarioLogueado", "true");
    localStorage.setItem("avatar", "img/avatarUsuario.png"); // Puedes cambiar esta ruta

    window.location.href = "../index.html"; // Redirigir a página principal
  } else {
    alert("Correo o clave inválidos.");
  }
});
