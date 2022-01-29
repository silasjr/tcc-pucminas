import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { RouterModule } from '@angular/router';
import { HomeRoutingModule } from './home.rounting.module';

@NgModule({
  declarations: [HomeComponent, SignInComponent],
  imports: [CommonModule, RouterModule, HomeRoutingModule],
})
export class HomeModule {}
