import { Injectable } from '@angular/core';

const KEY = 'auth_token';

@Injectable({ providedIn: 'root' })
export class TokenService {
  hasToken() {
    return !!this.getToken();
  }

  setToken(token: string) {
    window.localStorage.setItem(KEY, token);
  }

  getToken(): string {
    return `${window.localStorage.getItem(KEY)}`;
  }

  removeToken() {
    window.localStorage.removeItem(KEY);
  }
}
