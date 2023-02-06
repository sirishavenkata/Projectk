import { Injectable } from '@angular/core';
import { LoginComponent } from '../login/login.component';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  login!: LoginComponent;
  constructor() {}
}
