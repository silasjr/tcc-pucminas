import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AssociadoListComponent } from './associado-list/associado-list.component';
import { HttpClientModule } from '@angular/common/http';
import { AssociadoModule } from './associado/associado.module';
import { AssociadoListModule } from './associado-list/associado-list.module';

@NgModule({
  imports: [CommonModule, AssociadoListModule],
})
export class AssociadosModule {}
