import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { Subject, takeUntil } from 'rxjs';
import { formModel } from '../form/form.model';
import { FormsserviceService } from '../services/formsservice.service';

@Component({
  selector: 'app-updateform',
  templateUrl: './updateform.component.html',
  styleUrls: ['./updateform.component.css'],
})
export class UpdateformComponent implements OnInit {
    
  formdata:formModel[]=[];
  model!:formModel;
  columnDefs:any[]=['firstName', 'lastName','email','mobileNumber','overalExperience','relaventExperience','skills','dateOfBirth','certificates',
'highestDegree','nameOfCollege','percentage','stream', 'adarNumber','cloudExperience']
  dataSource=new MatTableDataSource<any>();
  constructor( private formservice: FormsserviceService) {}
  ngunsubscribe = new Subject<void>();
  ngOnInit(): void {
    this.showformdata();
  }

showformdata() {
this.formservice.getFormModel()
.pipe(takeUntil(this.ngunsubscribe)).subscribe((data:any)=>{
  console.log(data);
   this.dataSource.data= data;
   console.log(this.dataSource.data);
})
  }

}
