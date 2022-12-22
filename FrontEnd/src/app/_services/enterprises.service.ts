import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {Enterprise} from "../_models/enterprise";

@Injectable({
  providedIn: 'root'
})
export class EnterprisesService {
  baseUrl = environment.baseUrl;

  constructor(private http: HttpClient) {
  }


}
