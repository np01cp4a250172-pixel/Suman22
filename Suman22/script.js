// Elements
const userInputDiv = document.querySelector('.user-input');
const usernameInput = document.getElementById('username');
const startBtn = document.getElementById('start-btn');
const otpBox = document.querySelector('.otp-box');
const verifyBtn = document.querySelector('.verify-btn');
const loader = document.querySelector('.loader');
const mainText = document.querySelector('.main-text');
const subText = document.querySelector('.sub-text');
const finalScreen = document.querySelector('.final');
const finalTitle = document.querySelector('.final-title');

let username = "";

// Start button event
startBtn.addEventListener('click', () => {
  if (!usernameInput.value) {
    alert('Please enter your name');
    return;
  }
  username = usernameInput.value;

  // Hide user input, show OTP
  userInputDiv.classList.add('hidden');
  otpBox.classList.remove('hidden');
  verifyBtn.classList.remove('hidden');
  mainText.innerText = 'Awaiting user input…';
  subText.innerText = 'Enter your 6-digit verification code';
});

// OTP auto-focus
const inputs = document.querySelectorAll('.otp-box input');
inputs.forEach((input, index) => {
  input.addEventListener('input', () => {
    if (input.value && index < inputs.length - 1) {
      inputs[index + 1].focus();
    }
  });
});

// Verify OTP
verifyBtn.addEventListener('click', () => {
  let code = '';
  inputs.forEach(input => code += input.value);

  if (code.length < 6) {
    subText.innerText = 'Incomplete verification code';
    return;
  }

  // Hide OTP UI, show loader
  verifyBtn.classList.add('hidden');
  otpBox.classList.add('hidden');
  loader.classList.remove('hidden');

  mainText.innerText = 'Authentication in progress…';
  subText.innerText = 'Verifying credentials';

  setTimeout(() => {
    loader.classList.add('hidden');
    mainText.innerText = 'Authentication successful';
    subText.innerText = 'Secure session active';

    // Show personalized final screen
    setTimeout(() => {
      mainText.classList.add('hidden');
      subText.classList.add('hidden');
      finalTitle.innerText = `Welcome, ${username}`;
      finalScreen.classList.remove('hidden');
    }, 1200);

  }, 2500);
});
