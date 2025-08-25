import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { NavbarComponent } from "./navbar/navbar.component";


@Component({
  selector: 'app-root',
  imports: [FormsModule, NavbarComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'hello_world';

  message: string = "Uttam"
  required: boolean = false


  username: string = "";
  count: number = 0;
  increment() {
    this.count++;

  }
  decrement() {
    this.count--;

  }

  number1: any = 0;
  number2: any = 0;
  calculate: number | string = 0;
  add() {
    this.calculate = Number(this.number1) + Number(this.number2);
  }
  sub() {
    this.calculate = this.number1 - this.number2;
  }
  mup() {
    this.calculate = this.number1 * this.number2;
  }
  division() {
    this.calculate = this.number1 / this.number2;
  }

  xyz: boolean = false;

  isHighLighted: boolean = true;

  typedName: string = "";
  showname(value: string) {
    this.typedName = value;

  }

}
