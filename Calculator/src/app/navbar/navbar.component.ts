import { Component } from '@angular/core';
import { ServicesComponent } from "./services/services.component";
import { SignInComponent } from "./sign-in/sign-in.component";
import { SignupComponent } from "./signup/signup.component";
import { AboutComponent } from "./about/about.component";
import { HomeComponent } from "./home/home.component";

@Component({
  selector: 'app-navbar',
  imports: [ServicesComponent, SignInComponent, SignupComponent, AboutComponent, HomeComponent],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {

}
