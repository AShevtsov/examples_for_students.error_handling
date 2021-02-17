import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestSenderComponent } from './request-sender.component';

describe('RequestSenderComponent', () => {
  let component: RequestSenderComponent;
  let fixture: ComponentFixture<RequestSenderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RequestSenderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RequestSenderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
