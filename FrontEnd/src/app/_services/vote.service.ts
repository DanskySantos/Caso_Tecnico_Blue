import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {Enterprise} from "../_models/enterprise";
import {map} from "rxjs/operators";
import {User} from "../_models/user";

@Injectable({
  providedIn: 'root'
})
export class EnterprisesService {
  baseUrl = environment.baseUrl;

  constructor(private http: HttpClient) {
  }

  vote1(model: Enterprise) {
    return this.http.post(this.baseUrl + 'vote', model);
  }
  vote2(model: Enterprise) {
    return this.http.post(this.baseUrl + 'vote', model);
  }
  vote3(model: Enterprise) {
    return this.http.post(this.baseUrl + 'vote', model);
  }
}
