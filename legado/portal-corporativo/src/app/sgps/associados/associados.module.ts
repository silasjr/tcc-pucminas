import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AssociadoListComponent } from './associado-list/associado-list.component';
import { HttpClientModule } from '@angular/common/http';
import { AssociadoModule } from './associado/associado.module';
import { AssociadoListModule } from './associado-list/associado-list.module';
import { AssociadoFormModule } from './associado-form/associado-form.module';

@NgModule({
  imports: [CommonModule, AssociadoListModule, AssociadoFormModule],
})
export class AssociadosModule {}
