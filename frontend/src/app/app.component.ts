import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from './header/header.component';

@Component({
  selector: 'app-root',
  standalone: true,
  template: `
    <app-header></app-header>
    <router-outlet></router-outlet>
  `,
  imports: [RouterOutlet,HeaderComponent],
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'frontend';
}
