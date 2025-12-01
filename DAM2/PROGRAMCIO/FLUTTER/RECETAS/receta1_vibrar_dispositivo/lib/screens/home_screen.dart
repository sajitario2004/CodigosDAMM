import 'package:flutter/material.dart';

class ReceiptsHome extends StatelessWidget {
  const ReceiptsHome({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Pagina Nacho")// TODO: Añade el título aquí
      ),
      drawer: Drawer(
        child: ListView(
          padding: EdgeInsets.zero,
          children: <Widget>[
            DrawerHeader(
              decoration: BoxDecoration(
                color: Colors.red // TODO: Elige un color para la cabecera
              ),
              child: Text(
                'Menu',
                // TODO: Añade el título del menú
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 24,
                ),
              ),
            ),
            // TODO: Añade un ListTile para "Inicio"
            // Ejemplo:
            ListTile(
              leading: const Icon(Icons.vibration),
              title: const Text('Vibracion'),
              onTap: () {
                Navigator.pop(context); // Cierra el drawer
                Navigator.pushNamed(context, '/vibration');
              },
            ),
            
            // TODO: Añade ListTile para "Vibración"
            // - Usa Icons.vibration
            // - Navega a '/vibration' con Navigator.pushNamed(context, '/vibration');
            // - Recuerda cerrar el drawer primero con Navigator.pop(context)
            
            // TODO: Añade ListTile para "Cámara"
            // - Usa Icons.camera o Icons.camera_alt
            // - Navega a '/camera'
            
            // TODO: Añade ListTile para "Galería"
            // - Usa Icons.photo_library o Icons.browse_gallery
            // - Navega a '/gallery'
            
            // TODO: Añade ListTile para "GPS"
            // - Usa Icons.gps_fixed o Icons.location_on
            // - Navega a '/gps'
            
            // TODO: Añade ListTile para "Acelerómetro"
            // - Usa Icons.screen_rotation o Icons.sensors
            // - Navega a '/accelerometer'
            
            // TODO: Añade ListTile para "Micrófono"
            // - Usa Icons.mic
            // - Navega a '/microphone'
            
            // TODO: Añade ListTile para "Info Dispositivo"
            // - Usa Icons.smartphone o Icons.devices
            // - Navega a '/device_info'
          ],
        ),
      ),
      body: Center(
        child: Text(
          'Bienvenidos a el recetario de flutter', // TODO: Añade un mensaje de bienvenida
          style: Theme.of(context).textTheme.headlineLarge,
        ),
      ),
    );
  }
}