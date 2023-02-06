import { Skills } from './skills.model';

export class formModel {
  constructor(
    public firstName = '',
    public lastName = '',
    public Email = '',
    public mobileNumber: Number = 0,
    public overallexperience: Number = 0,
    public skills: '',
    public relaventExperience: Number = 0,
    public education: {
      highestDegree: '';
      nameOfCollege: '';
      stream: '';
      percentage: 0;
      certificates: '';
    },
    public dateOfBirth: Date,
    public cloudExperience: false,
    public adarNumber: ''
  ) {}
}
