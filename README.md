# keyboard-config-change

Demonstrates issue with Activity being recreated when USB keyboard attached/detached from device.

MainActivity shows its instance number on screen, and is set to use `android:configChanges="keyboard|keyboardHidden|orientation"`. 

The instance number does not change when changing from portrait to landscape, but it does change when plugging in and unplugging a USB keyboard.

Keyboards tested:

1/ Rii RT518 (wireless keyboard and trackpad)

2/ Vissles LP85

Attaching/detaching the Samsung Galaxy Tab S7 Keyboard Cover to the Tab S7 does not restart the Activity.

Devices tested:

1/ Pixel 7

2/ Samsung Tab S7

3/ Samsung Fold 3
