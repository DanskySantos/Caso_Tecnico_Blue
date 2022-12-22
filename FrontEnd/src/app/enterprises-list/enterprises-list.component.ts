import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {EnterprisesService} from "../_services/enterprises.service";
import {Enterprise} from "../_models/enterprise";

@Component({
  selector: 'app-enterprises-list',
  templateUrl: './enterprises-list.component.html',
  styleUrls: ['./enterprises-list.component.css']
})
export class EnterprisesListComponent implements OnInit {

  form: FormGroup;
  enterprisesList: Enterprise[];
  enterprise: Enterprise;
  toFile;

  constructor(private enterpriseService: EnterprisesService) {
  }

  ngOnInit(): void {

    this.configurarForm();
    // this.listEnterprises();
  }

  private configurarForm() {
    this.form = new FormGroup({
      name: new FormControl(''),
      image: new FormControl('')
    });
  }

  // private listEnterprises() {
  //   this.enterpriseService.listEnterprises().subscribe(enterprises => {
  //     this.enterprisesList = enterprises;
  //   });
  // }

  public alreadyVoted() {
    if (localStorage.getItem('user.vote') === null) {
      return true;
    }
  }

  vote1() {

  }

  vote2() {

  }

  vote3() {

  }
}
