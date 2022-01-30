import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UF } from '../../uf/uf';
import { ActivatedRoute } from '@angular/router';
import { UFService } from '../../uf/uf.service';
import { Municipio } from '../../uf/municipio';
import { Associado } from '../associado/associado';
import { AssociadoService } from '../associado/associado.service';

@Component({
  selector: 'app-associado-form',
  templateUrl: './associado-form.component.html',
  styleUrls: ['./associado-form.component.css'],
})
export class AssociadoFormComponent implements OnInit {
  constructor(
    private activatedRoute: ActivatedRoute,
    private ufService: UFService,
    private associadoService: AssociadoService
  ) {}

  ufs: UF[] = [];
  municipios: Municipio[] = [];
  selectedUF: UF | null = null;

  ngOnInit(): void {
    this.ufs = this.activatedRoute.snapshot.data['ufs'];
    console.log('ufs', this.ufs);
  }

  onChangeUF(form: NgForm) {
    const siglaUF = this.selectedUF?.sigla || '';
    this.ufService.listMunicipiosPorSiglaUF(siglaUF).subscribe({
      next: (result) => (this.municipios = result),
    });
  }

  onSubmit(form: NgForm) {
    const value = form.value;

    const associado = {
      nome: value.nome,
      cpf: value.cpf,
      dataNascimento: value.dataNascimento,
      sexo: value.sexo,
      email: value.email,
      telefone1: value.telefone1,
      telefone2: value.telefone2,
      planoDeSaude: {
        tipoPlano: value.tipoPlano,
        tipoAcomodacao: value.tipoAcomodacao,
        abrangencia: value.abrangencia,
        statusPlano: value.statusPlano,
        dtInicioVigencia: value.dtInicioVigencia,
        dtFimVigencia: value.dtFimVigencia,
      },
      endereco: {
        cep: value.cep,
        uf: value.uf,
        municipio: value.municipio,
        bairro: value.bairro,
        logradouro: value.logradouro,
        numero: value.numero,
        complemento: value.complemento,
      },
    };

    this.associadoService.salvar(associado).subscribe({
      next: () => {
        console.log('value', associado);
      },
    });
  }
}
