import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OneserviceService {
  constructor() { }

  private bgInit="https://d2slcw3kip6qmk.cloudfront.net/marketing/blog/2017Q2/project-planning-header@2x.png";

  bgpath:BehaviorSubject<string>=new BehaviorSubject(this.bgInit);
}
