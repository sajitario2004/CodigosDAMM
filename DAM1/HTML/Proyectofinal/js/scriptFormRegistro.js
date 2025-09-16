const form = document.getElementById("registroForm");
const nombre = document.getElementById("nombre");
const email = document.getElementById("email");
const password = document.getElementById("password");
const confirmar = document.getElementById("confirmar");
const terminos = document.getElementById("terminos");
const mensaje = document.getElementById("mensaje");

const errorNombre = document.getElementById("errorNombre");
const errorEmail = document.getElementById("errorEmail");
const errorPassword = document.getElementById("errorPassword");
const errorConfirmar = document.getElementById("errorConfirmar");
const errorTerminos = document.getElementById("errorTerminos");

nombre.addEventListener("input", () => {
  if (nombre.value.trim().length < 3) {
    errorNombre.textContent = "Debe tener al menos 3 caracteres.";
  } else {
    errorNombre.textContent = "";
  }
});

email.addEventListener("input", () => {
  if (!validarEmail(email.value.trim())) {
    errorEmail.textContent = "Correo inválido. Debe contener @ y un punto.";
  } else {
    errorEmail.textContent = "";
  }
});

password.addEventListener("input", () => {
  if (!validarPassword(password.value)) {
    errorPassword.textContent = "Debe tener al menos 6 caracteres, una mayúscula, una minúscula, un número y un carácter especial.";
  } else {
    errorPassword.textContent = "";
  }
});

function validarPassword(password) {
  const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[\W_]).{6,}$/;
  return regex.test(password);
}

confirmar.addEventListener("input", () => {
  if (confirmar.value !== password.value) {
    errorConfirmar.textContent = "Las contraseñas no coinciden.";
  } else {
    errorConfirmar.textContent = "";
  }
});

form.addEventListener("submit", function (e) {
  e.preventDefault();
  let valido = true;

  //revalidar todo al enviar
  if (nombre.value.trim().length < 3) {
    errorNombre.textContent = "Debe tener al menos 3 caracteres.";
    valido = false;
  }else {

  }

  if (!validarEmail(email.value.trim())) {
    errorEmail.textContent = "Correo inválido. Debe contener @ y un punto.";
    valido = false;
  }

  if (password.value.length < 6) {
    errorPassword.textContent = "Mínimo 6 caracteres.";
    valido = false;
  }

  if (confirmar.value !== password.value) {
    errorConfirmar.textContent = "Las contraseñas no coinciden.";
    valido = false;
  }

  if (!terminos.checked) {
    errorTerminos.textContent = "Debes aceptar los términos.";
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
  errorNombre.textContent = "";
  errorEmail.textContent = "";
  errorPassword.textContent = "";
  errorConfirmar.textContent = "";
  errorTerminos.textContent = "";
}
