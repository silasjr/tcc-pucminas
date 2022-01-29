import { Component, OnInit } from '@angular/core';
import { Associado } from '../associado/associado';
import { ActivatedRoute } from '@angular/router';
import { AssociadoService } from '../associado/associado.service';

@Component({
  selector: 'app-associado-list',
  templateUrl: './associado-list.component.html',
  styleUrls: ['./associado-list.component.css'],
})
export class AssociadoListComponent implements OnInit {
  associados: Associado[] = [];

  constructor(
    private activatedRoute: ActivatedRoute,
    private associadoService: AssociadoService
  ) {}

  ngOnInit(): void {
    this.associados = this.activatedRoute.snapshot.data['associados'];
    console.log('associados', this.associados);
  }
}
