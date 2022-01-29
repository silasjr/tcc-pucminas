import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SgpsComponent } from './sgps.component';

describe('SgpsComponent', () => {
  let component: SgpsComponent;
  let fixture: ComponentFixture<SgpsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SgpsComponent],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SgpsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
