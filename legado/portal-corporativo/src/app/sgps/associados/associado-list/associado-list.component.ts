import { Component, OnInit } from '@angular/core';
import { Associado } from '../associado/associado';
import { ActivatedRoute } from '@angular/router';
import { AssociadoService } from '../associado/associado.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-associado-list',
  templateUrl: './associado-list.component.html',
  styleUrls: ['./associado-list.component.css'],
})
export class AssociadoListComponent implements OnInit {
  associados: Associado[] = [];

  constructor(
    private router: Router,
    private activatedRoute: ActivatedRoute,
    private associadoService: AssociadoService
  ) {}

  ngOnInit(): void {
    this.associados = this.activatedRoute.snapshot.data['associados'];
    console.log('associados', this.associados);
  }

  goForm() {
    this.router.navigate(['sgps', 'associados', 'add']);
  }
}
