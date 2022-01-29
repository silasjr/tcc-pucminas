import { Component, OnInit } from '@angular/core';

export interface Menu {
  name: string;
  url: string[];
  icon: string;
}

@Component({
  selector: 'app-sgps',
  templateUrl: './sgps.component.html',
  styleUrls: ['./sgps.component.css'],
})
export class SgpsComponent implements OnInit {
  constructor() {}

  menus: Menu[] = [];

  ngOnInit(): void {
    this.menus = [
      {
        name: 'Dashboard',
        url: ['dashboard'],
        icon: 'fa-home',
      },
      {
        name: 'Associados',
        url: ['associados'],
        icon: 'fa-users',
      },
    ];
  }
}
