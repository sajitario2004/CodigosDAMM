def make_shirt(size, message="I love python\n"):
    print(f"Shirt with size: {size}")
    

    match size:
        case "L":
            print(message)
        case "M":
            print(message)
        case _:
            print(f"Tu mensaje es: {message}")

        
        
make_shirt(size="L", message="mensaje de prueba1\n")
make_shirt(size="M")
make_shirt(size="XL", message="mensaje de prueba2\n")