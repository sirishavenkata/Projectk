import { TestBed } from '@angular/core/testing';

import { OneserviceService } from './oneservice.service';

describe('OneserviceService', () => {
  let service: OneserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OneserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
