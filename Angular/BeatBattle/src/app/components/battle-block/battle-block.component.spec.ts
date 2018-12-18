import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BattleBlockComponent } from './battle-block.component';

describe('BattleBlockComponent', () => {
  let component: BattleBlockComponent;
  let fixture: ComponentFixture<BattleBlockComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BattleBlockComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BattleBlockComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
