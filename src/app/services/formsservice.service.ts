import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, tap, throwError } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Apipaths } from '../apipaths';
import { formModel } from '../form/form.model';
import { Skills } from '../form/skills.model';

@Injectable({
  providedIn: 'root',
})
export class FormsserviceService {
  err: any;
  constructor(private httpClient: HttpClient) {}

  baseUrl = environment.baseUrl;

  getFormModel() {
    let url = `${this.baseUrl}/${Apipaths.getforms}`;
    return this.httpClient.get<formModel>(url);
  }

  getSkillsModel() {
    let url = `${this.baseUrl}/${Apipaths.getskills}`;
    return this.httpClient.get<Skills>(url);
  }

  saveFormModel(formData: formModel): Observable<formModel> {
    let url = `${this.baseUrl}/${Apipaths.saveform}`;
    return this.httpClient.post<formModel>(url, formData);
  }
  handleError() {
    return this.err
      .map((res: Response) => res.json())
      .catch((error: any) => {
        // todo: log?

        if (error.status == 500) {
          console.log(error.statusText);
        } else if (error.status == 588) {
          console.log(error.statusText);
        }

        return throwError(error.statusText);
      });
  }
}
