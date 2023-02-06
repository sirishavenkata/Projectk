import { Component, OnInit } from '@angular/core';
import { OneserviceService } from '../oneservice.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private homeservice:OneserviceService) { }

  ngOnInit(): void {
      
  }
  bgpath='';

  ngOnChanges(): void {
    this.homeservice.bgpath.next(this.bgpath);

  }

}
