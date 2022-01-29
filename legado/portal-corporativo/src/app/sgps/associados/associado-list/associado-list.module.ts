import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AssociadoModule } from '../associado/associado.module';
import { AssociadoListComponent } from './associado-list.component';

@NgModule({
  declarations: [AssociadoListComponent],
  imports: [CommonModule, AssociadoModule],
})
export class AssociadoListModule {}
