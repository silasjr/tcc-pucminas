import { Injectable } from '@angular/core';
import {
  ActivatedRouteSnapshot,
  Resolve,
  RouterStateSnapshot,
} from '@angular/router';
import { Observable } from 'rxjs';
import { UF } from '../../uf/uf';
import { UFService } from '../../uf/uf.service';
import { Associado } from '../associado/associado';
import { AssociadoService } from '../associado/associado.service';

@Injectable({ providedIn: 'root' })
export class UFListResolver implements Resolve<Observable<UF[]>> {
  constructor(private ufService: UFService) {}

  resolve(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ): Observable<UF[]> {
    return this.ufService.listAll();
  }
}
