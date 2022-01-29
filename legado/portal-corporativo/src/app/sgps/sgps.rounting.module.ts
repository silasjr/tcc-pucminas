import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AssociadoListComponent } from './associados/associado-list/associado-list.component';
import { AssociadoListResolver } from './associados/associado-list/associado-list.resolver';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SgpsComponent } from './sgps.component';

const routes: Routes = [
  {
    path: '',
    component: SgpsComponent,
    //canActivate: [AuthGuard],
    children: [
      {
        path: 'associados',
        component: AssociadoListComponent,
        resolve: {
          associados: AssociadoListResolver,
        },
      },
      {
        path: 'dashboard',
        component: DashboardComponent,
      },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class SgpsRoutingModule {}
