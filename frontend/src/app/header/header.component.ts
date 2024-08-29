import { Component } from '@angular/core';
import { LogoComponent } from '../logo/logo.component';
import { ProfileMenuComponent } from '../profile-menu/profile-menu.component';
import { NavbarComponent } from '../navbar/navbar.component';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [LogoComponent, ProfileMenuComponent, NavbarComponent],
  template: `
    <div class="header-top">
      <app-logo></app-logo>
      <app-profile-menu></app-profile-menu>
    </div>
    <app-navbar></app-navbar>
  `,
  styleUrl: './header.component.css',
})
export class HeaderComponent {}
