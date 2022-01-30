import { Component, OnInit, ElementRef, ViewChild } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AuthService } from 'src/app/core/auth/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css'],
})
export class SignInComponent implements OnInit {
  signinForm: FormGroup;

  @ViewChild('usernameInput') userNameInput: ElementRef<HTMLInputElement>;

  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private authService: AuthService
  ) {}

  ngOnInit(): void {
    this.signinForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required],
    });
  }

  login() {
    const username = this.signinForm.get('username')?.value;
    const password = this.signinForm.get('password')?.value;

    this.authService.authenticate(username, password).subscribe({
      next: () => this.router.navigate(['portal']),
      error: (err) => {
        console.log(err);
        this.signinForm.reset();
        this.userNameInput.nativeElement.focus();
        alert('Invalid user name or password');
      },
    });
  }
}
