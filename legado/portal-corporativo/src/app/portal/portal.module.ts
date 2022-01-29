import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PortalComponent } from './portal/portal.component';
import { PortalRoutingModule } from './portal.rounting.module';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [PortalComponent],
  imports: [CommonModule, RouterModule, PortalRoutingModule],
})
export class PortalModule {}
