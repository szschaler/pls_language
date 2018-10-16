# Production-Line-System Language

This is an example executable domain-specific modelling language (xDSML) showcasing the use of Henshin for the definition of the operational semantics of xDSMLs. See the [Henshin xDSML Engine repository](https://github.com/szschaler/henshin_xdsmls) for the GEMOC plugin needed to run this example.

## Overview of the language

The production-line-system language is inspired by the [original production-line-system language](http://atenea.lcc.uma.es/index.php/Main_Page/Resources/E-motions/PLSExample) defined as an example for [*e-Motions*](http://atenea.lcc.uma.es/index.php/Main_Page/Resources/E-motions).

The metamodel for the production-line system can be seen in the figure below:

![Metamodel](docs/metamodel.png)

This is contained in the project [uk.ac.kcl.inf.modelling.pls.model](uk.ac.kcl.inf.modelling.pls.model/), a standard Ecore project from which the usual Ecore classes can be generated in the usual way.

Project [uk.ac.kcl.inf.modelling.pls.design](uk.ac.kcl.inf.modelling.pls.design) contains the Sirius design model for the concrete syntax. An example model (contained in project [uk.ac.kcl.inf.modelling.pls.example](uk.ac.kcl.inf.modelling.pls.example), to be set up in a runtime Eclipse instance with the metamodel and concrete syntax plugins installed) can be seen below.

![Model Example](docs/model_example.png)

This shows a simple production line producing hammers from heads and handles. A single handle has been produced and placed on a conveyor belt already.

The semantics of this modelling language are given by the set of [Henshin](https://www.eclipse.org/henshin/) rules shown below.

![Semantic Rules](docs/semantic_rules.png)

The top-left rule describes the behaviour of the handle-generating machine. The bottom-left rule shows the behaviour of the head-generating machine. The top-right rule shows how hammers are assembled from heads and handles, while the bottom-right rule shows how parts (heads, handles, hammers) move from conveyor belts to trays.

## Running the example

To run the example, right-click on the model in GEMOC Studio and select `Debug As/Debug Configurations...` Create a new `Henshin-Based eXecutable Model` and select the example model and the `.henshin` file as model and operational semantics, respectively. Also, chose the corresponding `.aird` file as the `Animator`.

![Launch configuration](docs/launch_config.png)

When you click on `Debug`, the standard GEMOC debugger will start and allow you to step through the example model.