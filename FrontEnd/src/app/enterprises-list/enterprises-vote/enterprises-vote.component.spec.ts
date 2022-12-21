import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnterprisesVoteComponent } from './enterprises-vote.component';

describe('EnterprisesVoteComponent', () => {
  let component: EnterprisesVoteComponent;
  let fixture: ComponentFixture<EnterprisesVoteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnterprisesVoteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EnterprisesVoteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
