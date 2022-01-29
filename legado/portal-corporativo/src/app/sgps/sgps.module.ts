import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SgpsComponent } from './sgps.component';
import { RouterModule } from '@angular/router';
import { SgpsRoutingModule as SgpsRoutingModule } from './sgps.rounting.module';
import { AssociadosModule } from './associados/associados.module';
import { DashboardModule } from './dashboard/dashboard.module';
import { HttpClientModule } from '@angular/common/http';
import { AssociadoModule } from './associados/associado/associado.module';

@NgModule({
  declarations: [SgpsComponent],
  imports: [
    CommonModule,
    RouterModule,
    AssociadoModule,
    AssociadosModule,
    DashboardModule,
    SgpsRoutingModule,
    HttpClientModule,
  ],
})
export class SgpsModule {}
