import { Injectable } from '@angular/core';
import {
  ActivatedRouteSnapshot,
  Resolve,
  RouterStateSnapshot,
} from '@angular/router';
import { Observable } from 'rxjs';
import { Associado } from '../associado/associado';
import { AssociadoService } from '../associado/associado.service';

@Injectable({ providedIn: 'root' })
export class AssociadoListResolver implements Resolve<Observable<Associado[]>> {
  constructor(private service: AssociadoService) {}

  resolve(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ): Observable<Associado[]> {
    return this.service.listAll();
  }
}
