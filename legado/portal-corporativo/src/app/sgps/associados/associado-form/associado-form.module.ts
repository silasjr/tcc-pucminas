import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AssociadoFormComponent } from './associado-form.component';
import { FormsModule } from '@angular/forms';
import { UfModule } from '../../uf/uf.module';

@NgModule({
  declarations: [AssociadoFormComponent],
  imports: [CommonModule, FormsModule, UfModule],
})
export class AssociadoFormModule {}
