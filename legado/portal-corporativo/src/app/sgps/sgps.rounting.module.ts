import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AssociadoFormComponent } from './associados/associado-form/associado-form.component';
import { AssociadoListComponent } from './associados/associado-list/associado-list.component';
import { AssociadoListResolver } from './associados/associado-list/associado-list.resolver';
import { UFListResolver } from './associados/associado-form/uf-list-resolver';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SgpsComponent } from './sgps.component';
import { UFService } from './uf/uf.service';

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
        path: 'associados/add',
        component: AssociadoFormComponent,
        resolve: {
          ufs: UFListResolver,
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
