import { Component, OnInit } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  constructor(private fb: FormBuilder, private router: Router) {}

  ngOnInit(): void {}
  loginForm = this.fb.group({
    Email: [''],
    password: [''],
  });

  Submit() {
    if (this.loginForm.valid) {
      console.log(this.loginForm.value);
    }
  }
}
