import { Injectable } from '@angular/core';
import { TokenService } from '../token/token.service';
import { BehaviorSubject } from 'rxjs';
import { Usuario } from './usuario';

@Injectable({ providedIn: 'root' })
export class UsuarioService {
  private usuarioSubject = new BehaviorSubject<Usuario | null>(null);

  constructor(private tokenService: TokenService) {
    this.tokenService.hasToken() && this.decodeAndNotify();
  }

  setToken(token: string) {
    this.tokenService.setToken(token);
    this.decodeAndNotify();
  }

  getUser() {
    return this.usuarioSubject.asObservable();
  }

  private decodeAndNotify() {
    const token: string = this.tokenService.getToken();
    const usuario = { id: 1, nome: 'ROnei', email: 'ronei' };

    this.usuarioSubject.next(usuario);
  }

  logout() {
    this.tokenService.removeToken();
    this.usuarioSubject.next(null);
  }

  isLogged() {
    return this.tokenService.hasToken();
  }
}
