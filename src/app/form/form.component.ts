import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { map, Observable, of, Subject, takeUntil, tap } from 'rxjs';
import { PopupComponent } from '../popup/popup.component';
import { formModel } from './form.model';
import { FormsserviceService } from '../services/formsservice.service';
import { Skills } from './skills.model';
import { MatSelectChange } from '@angular/material/select/select';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css'],
})
export class FormComponent implements OnInit {
  val!: any;
  show: boolean = false;
  selectedskills: any = [];
  selectedstring: any;
  formFillGroup: any;
  skillform: any;
  Date = new Date(Date.now());
  opendailog: any;
  response: any;

  allskills = [
    { id: 1, name: 'java' },
    { id: 2, name: 'Springboot' },
    { id: 3, name: 'Spring Microservices' },
    { id: 4, name: 'Advanced java' },
    { id: 5, name: 'Aws' },
    { id: 6, name: 'Azure' },
    { id: '7', name: 'Angular' },
    { id: '8', name: 'Full stack java with Angular' },
    { id: '9', name: 'Spring MVC' },
    { id: '10', name: 'Hibernate' },
    { id: '11', name: 'Artificial Intelligence' },
    { id: '12', name: 'Machine learning' },
    { id: '13', name: 'Apache kafka' },
    { id: '12', name: 'MongoDB' },
    { id: '15', name: 'Reactjs' },
    { id: '16', name: 'Javascript' },
    { id: '17', name: 'HTML5' },
    { id: '18', name: 'CSS3' },
    { id: '19', name: 'WebDevelopment' },
  ];

  streams = [
    'Computer Science [CSE]',
    'Electronics &Communication[ECE]',
    'Mechanical Engineering',
    'Information Technology[IT]',
    'Electrical Engineering[EEE]',
  ];
  ngunsubscribe = new Subject<void>();
  constructor(
    private fb: FormBuilder,
    private formservice: FormsserviceService,
    public dialog: MatDialog
  ) {
    this.formFillGroup = this.fb.group({
      firstName: '',
      lastName: '',
      email: '',
      mobileNumber: '',
      overallexperience: '',
      skills: '',
      relaventExperience: '',
      education: this.fb.group({
        highestDegree: '',
        stream: '',
        nameOfCollege: '',
        percentage: '',
        certifications: '',
      }),
      dateOfBirth: '',
      cloudExperience: '',
      adarNumber: '',
    });
  }
  public skills: any = [];

  ngOnInit() {
    this.showskills();
    console.log(this.formFillGroup.value);
  }

  private getskill() {
    /*return this.fb.group({
      dropdownSkill: [''],
    });*/
  }

  // addskill() {
  //   //this.formFillGroup.get('skills').push(this.getskill);
  //   this.formFillGroup
  //     .get('skills')
  //     ['controls'].get('dropdownSkill')
  //     .console.log(this.selectedskills);
  //   //console.log(this.formFillGroup.controls.skills.controls.dropdownSkill.push(val));
  // }

  // private removeskill(i: number) {
  //   const removeskillcontrl = this.formFillGroup.controls[
  //     'skills'
  //   ] as FormArray;
  //   removeskillcontrl.removeAt(i);
  // }
  forms: formModel[] = [];

  skillsmodel: any = [];

  validateDOB(dob: Date) {
    let year = new Date(dob).getFullYear();
    let today = new Date().getFullYear();
    if (today - year >= 100) {
      console.log('invalid date');
    }
  }
  // get Skills(): FormArray {
  //   return this.formFillGroup.get('skills') as FormArray;
  // }

  newSkill(): FormControl {
    return this.fb.control({
      skill: '',
    });
  }

  Submit() {
    console.log(this.formFillGroup.value);

    let save_data: formModel = this.formFillGroup.value;
    save_data.firstName = this.formFillGroup.get('firstName').value;
    save_data.lastName = this.formFillGroup.get('lastName').value;
    save_data.Email = this.formFillGroup.get('email').value;
    save_data.mobileNumber = this.formFillGroup.get('mobileNumber').value;
    save_data.overallexperience =
      this.formFillGroup.get('overallexperience').value;
    save_data.relaventExperience =
      this.formFillGroup.get('relaventExperience').value;
    save_data.skills = this.formFillGroup.get('skills').value;
    this.formFillGroup.get('dateOfBirth').value;
    save_data.education.certificates = this.formFillGroup
      .get('education')
      .get('certifications').value;
    save_data.education.highestDegree = this.formFillGroup
      .get('education')
      .get('highestDegree').value;
    save_data.education.nameOfCollege = this.formFillGroup
      .get('education')
      .get('nameOfCollege').value;
    save_data.education.stream = this.formFillGroup
      .get('education')
      .get('stream').value;
    save_data.education.percentage = this.formFillGroup
      .get('education')
      .get('percentage').value;
    this.formservice.saveFormModel(save_data).subscribe((data) => {
      this.forms.push(data);
      console.log(this.forms);
    });
  }

  openDailog(): void {
    this.opendailog = this.dialog.open(PopupComponent, {
      height: '150px',
      width: '300px',
      disableClose: false,
    });
  }

  showskills() {
    this.formservice
      .getSkillsModel()
      .pipe(takeUntil(this.ngunsubscribe))
      .subscribe((data) => {
        this.skills = data;
        console.log(this.skills);
      });
  }
}
